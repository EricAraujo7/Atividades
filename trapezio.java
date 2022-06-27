package Exertrapezio;
public static trapezio main(String[] args) {

    System.out.println("Bem-vindo ao calculador de área!");
    System.out.println("Informe qual objeto quer calcular: ");

    Scanner input = new Scanner(System.in);

    boolean trapézio = true, triângulo = true;

    if(trapézio){
        Double B,b,h,A;

        System.out.println("Informe o valor de B = base maior: ");
        B = input.nextDouble();
        System.out.println("Informe o valor de b = base menor: ");
        b = input.nextDouble();
        System.out.println("Informe o valor de h = altura");
        h = input.nextDouble();
        //calculando
        A = ((B + b)/2)*h;
        System.out.println("O valor dado é B: "+B+" b: "+b+" h: "+h);
        System.out.println("A área do trapézio é: "+A);
        input.close();
    }
    if(triângulo){
        Double B,h,A;

        System.out.println("Informe o valor de B = base: ");
        B = input.nextDouble();
        System.out.println("Informe o valor de h = altura: ");
        h = input.nextDouble();

        A = (h*(b+B))/2;
        System.out.println("O valor dado é B: "+B+" h: "+h);
        System.out.println("A área do triângulo é: "+A);
        input.close();
    }   

}

