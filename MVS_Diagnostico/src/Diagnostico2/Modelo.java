package Diagnostico2;

public class Modelo {
	public static double[] resuelve(Vista v,int n,double[][] m, double[] r)
	{
		
        for (int i = 0; i <n; i++) {
            double d, c = 0;
            d = m[i][i];// seleccionamos el pivote
            v.textArea.append(Double.toString(1/d) + "*fila" + (i + 1) + "\n");// muesra en el area de texto el pivote seleccionado
            for (int j = 0; j <n; j++) {// pasamos a convertir en 1 al pivote seleionado
                m[i][j] = ((m[i][j]) / d);
            }
            r[i] = ((r[i]) / d);


            // paso a mostrar las opraciones realizadas en la matriz aumentada
            for (int j = 0; j < n; j++) {
                
                for (int k = 0; k < n; k++) {
                	v.textArea.append(Double.toString(m[j][k]) + "\t");
                }
                v.textArea.append("|\t" + Double.toString(r[j]) + "\n");
            }
            v.textArea.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada



            for (int x = 0; x <n; x++) {
                if (i != x) {
                    c = m[x][i];
                    v.textArea.append("-" + Double.toString(c) + " * fila" + (i + 1) + "+ fila" + (x + 1) + "\n");// mustra en pantalla las opraciones que se realizaran por fila
                    for (int y = 0; y <n; y++) {// se hace cero a todos los elemntos de la colunma que no sean el pivote
                        m[x][y] = m[x][y] - c * m[i][y];

                    }
                    r[x] = r[x] - c * r[i];

                    // paso a mostrar las opraciones realizadas en la matriz aumentada
                    for (int j = 0; j < n; j++) {
                       
                        for (int k = 0; k < n; k++) {
                        	v.textArea.append(Double.toString(m[j][k]) + "\t");
                        }
                        v.textArea.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    v.textArea.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada


                }// fin if (i != x)
            }// fin for (int x = 0; x <= r.length - 1; x++)


        }//fin bucle i
        return r;// retorna la solucion l sistema
	}
}
