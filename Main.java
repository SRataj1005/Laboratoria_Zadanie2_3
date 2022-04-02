class Main {
  public static void main(String[] args) 
  {
  double[] srednia = {4.0,3.0,5.0,3.5,4.5,5.0,2.0};
  double suma = 0;
  System.out.println("Oceny:");
  for(int i = 0; i < srednia.length; i++)
    {
      System.out.println(srednia[i]);
      suma = suma + srednia[i];
    }
 double wynik = suma / srednia.length;
 System.out.print("Średnia tych ocen: "+ wynik);
  
  }
}