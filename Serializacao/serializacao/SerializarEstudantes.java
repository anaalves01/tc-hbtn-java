import java.io.*;
import java.util.*;

@SuppressWarnings(value="unchecked")
public class SerializarEstudantes<Estudante> {

    private String nomeArquivo;

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(getNomeArquivo());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(estudantes);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(getNomeArquivo());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            estudantes = (List<Estudante>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return estudantes;
    }

    public SerializarEstudantes() { }

    public SerializarEstudantes(String nomeArquivo) {
        setNomeArquivo(nomeArquivo);
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

}
