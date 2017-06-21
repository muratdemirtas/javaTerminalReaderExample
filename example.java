/**
 * Created by Murat on 21.06.2017.
 */
import java.io.*;

public class example
{
    public static void main(String[] arg)
    {
        final String networkInterfacesCommand = "ifconfig";
        final String getKernelVersionCommand = "uname -a";

        terminalReader.readTerminalOutput(networkInterfacesCommand);
        terminalReader.readTerminalOutput(getKernelVersionCommand);
    }
}
