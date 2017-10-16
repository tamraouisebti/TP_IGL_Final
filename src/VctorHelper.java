import java.util.Scanner;

/**
 * Created by Tamroui Karim on 16/10/2017.
 */
public class VctorHelper {                                   /* La classe represente un seul Vecteur*/


    private int vecteur[];                                   /* Un tablaux des entier (Vecteur)*/
    private int vlength;                                     /* la Taille du Vecteur*/





    public void setVecteur(int V[]){vecteur=V;}
    public void setVlength(int A){vlength=A;}
    public int getVlength(){return this.vlength;}
    public int getcase(int A){return this.vecteur[A];}       //retourne la valeur de la case numero A dans le vecteur

    public void intvecteur(){                                /*   initialise les valeur d un vecteur   */

        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez la Taille du vecteur : ");
        this.vlength=sc.nextInt();
        this.vecteur=new int[vlength];
        int i;
        for(i=0;i<vlength;i++)
        {
            System.out.print(i+":"); vecteur[i]=sc.nextInt();
        }

    }

    public void afficherVEc()                                 /* afficher les valeur d un vecteur V*/
    {   int i;
        System.out.println();
        for (i=0;i<vlength;i++){System.out.print("|"+vecteur[i]+"|");}
    }




    public void triVec(){         /* Tri Par Bull */


        int i,k,m;

        for(i=0;i<vlength;i++){
            for(k=vlength-1;k>i;k--){
                if (vecteur[k]<vecteur[k-1]){
                    m=vecteur[k];
                    vecteur[k]=vecteur[k-1];
                    vecteur[k-1]=m;
                }
            }
        }


    }


    public VctorHelper SomVEC(VctorHelper V1)
    {                                                      /* Sommer les Colonne de deux Vecteur Et renvoi le Resultat dans un nouveau Vecteur */
        if(this.vlength!=V1.getVlength())
        {
            System.out.println("Les Vecteurs N'ont pas la meme Taille");           /* Renvoi un message en cas des Vecteur avec de taille deferente  */
            return null;
        }

        else {                                                                      /* Effectuer la Somme Des Vecteurs  */
            VctorHelper resultat = new VctorHelper();
            int Vresult[]=new int[vlength];
            int i=0;
            for(i=0;i<vlength;i++){Vresult[i]=this.vecteur[i]+V1.getcase(i);}
            resultat.setVecteur(Vresult);
            resultat.setVlength(vlength);

            return resultat;
        }
    }




    public void invVEC() {                                       /* Inverser Les elements Du Vecteur */
        int i=vlength/2;

        int k,m;
        for(k=0;k<i;k++){

            m=vecteur[k];
            vecteur[k]=vecteur[vlength-1-k];
            vecteur[vlength-1-k]=m;
        }
    }


}
