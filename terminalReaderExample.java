/**
 * Created by Murat on 21.06.2017.
 */

import java.io.*;

public class terminalReader {

    public static String readTerminalOutput (String command){

        try
        {
            Process readInterfaces = Runtime.getRuntime().
                                exec(command);

            BufferedReader terminalReader = new BufferedReader(new
                    InputStreamReader(readInterfaces.getInputStream()));

            String buffer;
            while ((buffer = terminalReader.readLine()) != null) {
                System.out.println(buffer);
            }
            terminalReader.close();
            return buffer;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


