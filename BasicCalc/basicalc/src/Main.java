import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        Math objMath = new Math();
        do{
            String[] operacoe = { "+", "-", "/", "x", "Sair"};
            String input = (String) JOptionPane.showInputDialog(null, "Escolha a operação:","BASIC CALC",JOptionPane.QUESTION_MESSAGE,null,operacoe,operacoe[1]);

            if (input == "+"){
                int first = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));
                int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));

                objMath.setFirst(first);
                objMath.setSec(sec);

                int calc = objMath.getFirst() + objMath.getSec();
                JOptionPane.showMessageDialog(null, "A resposta é:"+calc, input, JOptionPane.INFORMATION_MESSAGE);
            }else if (input == "-"){
                int first = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));
                int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));

                objMath.setFirst(first);
                objMath.setSec(sec);

                int calc = objMath.getFirst() - objMath.getSec();
                JOptionPane.showMessageDialog(null, "A resposta é:"+calc, input, JOptionPane.INFORMATION_MESSAGE);

            }else if (input == "/"){
                int first = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));
                int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));

                objMath.setFirst(first);
                objMath.setSec(sec);

                int calc = objMath.getFirst() / objMath.getSec();
                JOptionPane.showMessageDialog(null, "A resposta é:"+calc, input, JOptionPane.INFORMATION_MESSAGE);

            }else if (input == "x"){
                int first = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));
                int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo número:","BASIC CALC",JOptionPane.QUESTION_MESSAGE));

                objMath.setFirst(first);
                objMath.setSec(sec);

                int calc = objMath.getFirst() * objMath.getSec();
                JOptionPane.showMessageDialog(null, "A resposta é:"+calc, input, JOptionPane.INFORMATION_MESSAGE);
            }else{
                System.exit(0);
            }
        }while(true);
    }
}