package log4j;


import org.apache.log4j.Logger;

public class Runner {
    static Logger log = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) {
        log.trace("TRACE");
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
        log.fatal("FATAL");
    }
}
