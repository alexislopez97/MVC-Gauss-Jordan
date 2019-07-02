package Diagnostico2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener
{
	Vista vis;
	Modelo mod;
	public Controlador(Vista vis, Modelo mod) 
	{
		
		this.vis = vis;
		this.mod = mod;
		
		//this.vis.btnResolverElSistema.addActionListener(this);
		this.vis.btnGenerarMatrizAumentada.addActionListener(this);
		this.vis.btnResolverElSistema.addActionListener(this);
	}
	
	public void iniciarVista()
	{
		vis.setVisible(true);
		vis.setTitle("Guass Jordan");
	}


	public void actionPerformed(ActionEvent e) 
	{
		int n;
		DefaultTableModel modeltable = new DefaultTableModel();
		//Boolean ban = false;
		if(e.getSource() == vis.btnGenerarMatrizAumentada)
		{
			try {
				n = Integer.parseInt(vis.jtextFieldN.getText());
				if (n<=1) 
				{
					throw new Exception("Ha ingresado un numero de incognitas invalido");
				}
				
				Object columna[] = new Object[n+1];
				for (int i = 0; i < n+1; i++) 
				{
					if (i<n) {
						columna[i] = "x" + (i+1);
					} else {
						columna[i] = "d";
					}
				}
				
				modeltable = new DefaultTableModel(columna,n);//El JTable toma la dimension de la matriz aumentada
				vis.table.setModel(modeltable);
				
			} catch(Exception d){
				//JOptionPane.showMessageDialog(this, d.getMessage());
			}
		}
		if(e.getSource() == vis.btnResolverElSistema)
		{
			/// Boton btnResolverElSistema
			try {
				n = Integer.parseInt(vis.jtextFieldN.getText());
	            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada 
	            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

	            for (int i = 0; i < n; i++) {

	                for (int j = 0; j < n; j++) {
	                    m[i][j] = Double.parseDouble(String.valueOf(vis.table.getValueAt(i, j)));

	                }
	                r[i] = Double.parseDouble(String.valueOf(vis.table.getValueAt(i, n)));
	            }
	            
	            r = Modelo.resuelve(vis,n, m, r);
	            for (int i = 0; i < n; i++) {
	                vis.textArea.append("x" + (i + 1) + " = " + r[i] + "\n");
	                System.out.println("x" + (i + 1) + " = " + r[i] + "\n");
	                
	            }
	                       
	        } catch (Exception f) {
	            //JOptionPane.showMessageDialog(this, "error en la lectura de datos");
	        }
		}
		
	}
}
