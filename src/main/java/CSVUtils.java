import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CSVUtils {

    public void escrever(Funcionario funcionario){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("func_filtrado.csv", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Id: " + funcionario.getId());
            bw.write(", Número de filhos: " + funcionario.getNumFilhos());
            bw.write(", Salário: " + funcionario.getSalario());
            bw.newLine();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }



}
