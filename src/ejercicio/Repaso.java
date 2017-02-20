/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author bruiz9
 */
public class Repaso {

    public static void main(String[] args) {
//1
        int acum = 0;
        int acump = 1;
        ArrayList<Integer> ab = new ArrayList<Integer>();
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);
        ab.add(6);
        ab.add(7);
        ab.add(8);
        ab.add(9);
        ab.add(1);
        for (int i = 0; i < ab.size(); i++) {
            acum = acum + ab.get(i);
            acump = acump * ab.get(i);
        }
        System.out.println("La suma de los elementos es: " + acum + "\n"
                + "El producto de los elementos es: " + acump);

//2
        int[][] num = new int[4][2];
        int ac = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(num[i][j]);
            }
        }

        for (int x = 0; x < num.length; x++) {
            for (int y = 0; y < num[x].length; y++) {
                ac = ac + num[x][y];
            }
        }
        System.out.println("");
        System.out.println("La suma es: " + ac);
//3

        int p = 0;
        int acun = 0;
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(a[i][j]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                acun = acun + a[i][j];
                p = acun / 9;
            }
        }
        System.out.println("");
        System.out.println("El promedio es:" + p);
//4
        int[][] b = new int[4][4];
        int au = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(b[i][j]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) {
                    au = au + b[i][j];
                }
            }
        }
        System.out.println("");
        System.out.println("La sumatoria es: " + au);

//5
        ArrayList<Integer> ba = new ArrayList<Integer>();
        ba.add(1);
        ba.add(2);
        ba.add(3);
        ba.add(4);
        ba.add(5);
        ba.add(6);
        ba.add(7);
        ba.add(8);
        ba.add(9);
        ba.add(8);
        ba.add(7);
        ba.add(6);
        ba.add(5);
        ba.add(4);
        ba.add(3);
        ba.add(2);
        ba.add(1);
        ba.add(0);
        ba.add(1);
        ba.add(2);

        System.out.println("");
        System.out.println("Elemento dado: " + ab.get(3));
//6 
        int[][] c = new int[3][4];
        int nmay = 0, x = 0, y = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = (int) (Math.random() * 50 + 1);
                System.out.println(c[i][j]);

            }
            System.out.println("");
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i][j] > nmay) {
                    nmay = c[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("");
        System.out.println("El número mayor es: " + nmay + "\n En la posición: (" + x + ")(" + y + ")");

//7 
        ArrayList<Integer> abc = new ArrayList<Integer>();
        int acuml = 0;
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        abc.add(5);
        abc.add(6);
        abc.add(7);
        abc.add(8);

        for (int i = 0; i < abc.size(); i++) {
            if (abc.get(i) % 2 == 0) {
                acuml = acuml + abc.get(i);
            }
        }
        System.out.println("");
        System.out.println("La sumatoria e: " + acuml);

//8 
        int[][] d = new int[2][5];
        int aum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(d[i][j]);
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] % 2 == 0) {
                    aum = aum + d[i][j];
                }
            }
        }
        System.out.println("");
        System.out.println("La sumatoria de los num pares es: " + aum);

//9 
        int contp = 0, conti = 0, contn = 0;
        int[][] e = new int[3][5];
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                e[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(e[i][j]);
            }
        }

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if (e[i][j] == 0) {
                    contn = contn + 1;
                } else if (e[i][j] % 2 != 0) {
                    conti = conti + 1;
                } else {
                    contp = contp + 1;
                }
            }
        }
        System.out.println("");
        System.out.println("La cantidad de Numeros pares es: " + contp + "\n"
                + "La cantidad de Numeros impares es: " + conti + "\n"
                + "La cantidad de Numeros neutro es: " + contn);

//11
        ArrayList<Integer> cd = new ArrayList<Integer>();
        int prom;
        int acu = 0;
        cd.add(1);
        cd.add(2);
        cd.add(3);
        cd.add(4);
        cd.add(5);
        cd.add(6);
        cd.add(7);
        cd.add(8);
        cd.add(9);
        cd.add(8);
        cd.add(7);
        cd.add(6);
        cd.add(5);
        cd.add(4);
        cd.add(3);

        for (int i = 0; i < cd.size(); i++) {
            acu = acu + cd.get(i);
        }
        prom = acu / 15;
        System.out.println("");
        System.out.println("El promedio aritmetico es: " + prom);
//12
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mr = new int[3][3];
        //   System.out.println("");
        //  System.out.println("pr");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(m1[i][j]);
            }
        }
        //  System.out.println("sec");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = (int) (Math.random() * 9 + 1);
                //System.out.println(m2[i][j]);
            }
        }
        for (int i = 0; i < mr.length; i++) {
            for (int j = 0; j < mr.length; j++) {
                mr[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("");
        System.out.println("Suma de dos matrices de 3x3:");
        for (int i = 0; i < mr.length; i++) {
            for (int j = 0; j < mr.length; j++) {
                System.out.println(mr[i][j]);
            }
        }
        //13
        int[][] m = new int[4][4];
        System.out.println("");
        System.out.println("La matriz Identidad es:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.println(m[i][j] + "");
            }
            System.out.println("");
        }
    }
}
