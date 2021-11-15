import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:/Users/Aline Marcondes/Desktop/funcionarios.csv";
        String line = "";

        Funcionario f = new Funcionario();
        CSVUtils c = new CSVUtils();

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            line = br.readLine();
            while ((line = br.readLine()) != null){
                String[] valores = line.split(",");

                if(!valores[3].equals("0")){
                    f.setId(Integer.parseInt(valores[0]));
                    f.setNumFilhos(Integer.parseInt(valores[3]));
                    f.setSalario(Double.parseDouble(valores[4]));
                    c.escrever(f);
                }

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
