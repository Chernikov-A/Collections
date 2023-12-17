import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {
        String inputFile = "files/to_download.txt";
        String outputFile = "files/downloads/";
        Downloader.downloadFromFile(7, inputFile, outputFile);
    }
}