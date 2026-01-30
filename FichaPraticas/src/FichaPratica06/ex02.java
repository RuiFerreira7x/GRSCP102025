package FichaPratica06;

import jdk.dynalink.beans.StaticClass;

public class ex02 {
    public static int numeropequeno(int n1, int n2, int n3){

        int num=0;

        if (n1 < n2 && n2 < n3);{

            num= n1;
        }
        if (n2 < n1 && n2 < n3);{

            num = n2;
        }
        if (n3 < n1 && n3 < n2);{

            num = n3;
        }
        return num;

    }
    
}
