package com.epam;

import org.apache.log4j.Logger;

public class Child implements IFather, IMother {
    final static Logger LOG = Logger.getLogger(Runner.class.getName());
    public void patience() {
        LOG.info("Child has patience");
    }

    public void play() {
        LOG.info("Child plays");
    }

    public void helpingNature() {
        LOG.info("Child develops helping nature");
    }
}
