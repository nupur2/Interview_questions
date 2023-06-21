import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateThreadDump {


    public static void main(String [] args){

    }



    private static void threadDump(boolean lockedMonitors, boolean lockedSynchronizers) throws IOException, IOException {
        Path threadDumpFile = Paths.get("ThreadDumpOutput.txt");

        StringBuffer threadDump = new StringBuffer(System.lineSeparator());
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for(ThreadInfo threadInfo : threadMXBean.dumpAllThreads(lockedMonitors, lockedSynchronizers)) {
            threadDump.append(threadInfo.toString());
        }
        Files.write(threadDumpFile, threadDump.toString().getBytes());
    }
}
