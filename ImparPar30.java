package ExerImparPar30;
import javax.swing.JOptionPane;
class Numeros{

public static void main (String []args){

int x = 0, par=0, impar=0;
int i, mp, si, totalPar;

for(i=0; i<30; i++){

if(i%2==0){

if(i>2){

par = par*i;

}

else{
par = i;
}
}

else{

impar = impar+i; //este deu certo: 225
}

}

JOptionPane.showMessageDialog(null, "Soma dos ímpares é: "+impar);
JOptionPane.showMessageDialog(null, "Multiplicação dos pares é: "+par);
}

}