/**
 * Created by Murat on 21.06.2017.
 */

import java.io.*;

public class terminalReader {

    public static void main (String[] args){
        final String NetworkInterfacesCommand = "ifconfig";
        try
        {
            Process readInterfaces = Runtime.getRuntime().
                                exec(NetworkInterfacesCommand);

            BufferedReader terminalReader = new BufferedReader(new
                    InputStreamReader(readInterfaces.getInputStream()));

            String buffer;
            while ((buffer = terminalReader.readLine()) != null) {
                System.out.println(buffer);
            }
            terminalReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
