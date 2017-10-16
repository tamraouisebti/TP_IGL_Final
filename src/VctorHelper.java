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
    public void triervect(){


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

    public int max ()   /* .........la fonction qui va définir le max........*/
    {
        triervect();       /*.....appele de la fonction de tri....*/
        return vecteur[vlength];
    }

    public int min ( )     /*.....la fonction qui définie le min....*/
    {
        triervect();
        return vecteur[0];
    }

    void vect_formule() {
        System.out.println(" Entrez l'operation que vous voulez effectuer sur votre vecteur : ");

        System.out.println(" --> Pour l'addition tapez ' 1 ' ");
        System.out.println("   --> pour la multuplication tapez ' 2 ' ");
        System.out.println("     --> Pour la division tapez ' 3 ' ");
        System.out.println("       --> Pour soustraction tapez ' 4 ' ");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        System.out.println(" Entrer votre nombre : ");
        Scanner sc1 = new Scanner(System.in);
        int nombre = sc1.nextInt();

        switch (choix) {
            case 1:

                for (int i= 0; i < vlength; i++) {
                    vecteur[i] = vecteur[i] + nombre;

                }break;
            case 2:

                for (int i = 0;i < vecteur.length;i++) {
                    vecteur[i]=vecteur[i]*nombre;

                }break;

            case 3:
                try {
                    for (int i = 0; i < vecteur.length; i++) {
                        vecteur[i] = vecteur[i]/nombre;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("ERREUR !!!!!!! Devision par zero");
                }break;
            case 4:

                for (int i = 0; i < vecteur.length; i++) {
                    vecteur[i] = vecteur[i]-nombre;
                }break;

        }


    }
}
