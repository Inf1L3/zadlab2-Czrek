import java.util.Scanner;
package zadanie;

public class Zadanie {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tablica=new int[10];
        int i;
/*  zadanie 3
        for(i=0;i<10;i++)
        {
            tablica[i]=in.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            System.out.println(tablica[i]);
        }
        
        for(i=10;i>0;i--)
        {
             System.out.println(tablica[i]);
        }
        
        for(i=0;i<10;i=i+2)
        {
             System.out.println(tablica[i]);
        }
        
        for(i=1;i<10;i=i+2)
        {
             System.out.println(tablica[i]);
        }
        
        
       ZADANIE 4 
       
        int suma = 0;
        int iloczyn = 1;
        int min = 0;
        int max = 0;
        for(i=0;i<10;i++)
        {
            tablica[i]=in.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            suma=tablica[i]+suma;
        }
        System.out.println("suma wynosi "+suma);
        
        for(i=0;i<10;i++)
        {
            iloczyn=tablica[i]*iloczyn;
        }
        System.out.println("iloczyn wynosi "+iloczyn);
        System.out.println("srednia wartosc tablicy wynosi "+suma/10);
        min=tablica[0];
        for(i=0;i<10;i++)
        {
            if(tablica[i]<min)
            {
                min=tablica[i]
            }
        max=tablica[0];
        for(i=0;i<10;i++)
        {
            if(tablica[i]>max)
            {
                max=tablica[i]
            }
        }
        System.out.println("minimalna wartosc tablicy wynosi "+min);
        System.out.println("maksymalna wartosc tablicy wynosi "+max);
        
        ZADANIE 6
      
        System.out.println("wprowadz liczbe calkowita");
        
        int a;
        
        do
        {
        a=in.nextInt();
        
        }while(a>0);
        */
        System.out.println("wprowadz ile chcesz wprowadzic liczb");
       int n =in.nextInt();
       
        int[] tab=new int[n];
        
            for(i=0;i<n;i++)
        {
            tab[i]=in.nextInt();
        }
            int z=1;
            int t;
         while(z > 0){
            z = 0;
            for(i=0; i<n-1; i++){
            if(tab[i]>tab[i+1]){
            t = tab[i+1];
            tab[i+1] = tab[i];
            tab[i] = t;
                z++;
                
}  
            }
}
         for(i=0; i<n; i++){
     System.out.print(tab[i]+" ");
        }
    
    
}
}
