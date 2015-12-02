/*
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 Copyright (c) 2015 C2B2 Consulting Limited. All rights reserved.
 The contents of this file are subject to the terms of the Common Development
 and Distribution License("CDDL") (collectively, the "License").  You
 may not use this file except in compliance with the License.  You can
 obtain a copy of the License at
 https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 or packager/legal/LICENSE.txt.  See the License for the specific
 language governing permissions and limitations under the License.
 When distributing the software, include this License Header Notice in each
 file and include the License file at packager/legal/LICENSE.txt.
 */
package fish.payara.nucleus.healthcheck;

import java.util.concurrent.TimeUnit;

/**
 * @author mertcaliskan
 */
public class HealthCheckExecutionOptions {

    private long time;
    private TimeUnit unit;
    private int thresholdCritical;
    private int thresholdWarning;
    private int thresholdGood;

    public HealthCheckExecutionOptions(long time, TimeUnit unit) {
        this.time = time;
        this.unit = unit;
    }

    public HealthCheckExecutionOptions(long time, TimeUnit unit, String thresholdCritical, String thresholdWarning, String thresholdGood) {
        this.time = time;
        this.unit = unit;
        this.thresholdCritical = Integer.parseInt(thresholdCritical);
        this.thresholdWarning = Integer.parseInt(thresholdWarning);
        this.thresholdGood = Integer.parseInt(thresholdGood);
    }

    public long getTime() {
        return time;
    }

    public TimeUnit getUnit() {
        return unit;
    }

    public int getThresholdCritical() {
        return thresholdCritical;
    }

    public int getThresholdWarning() {
        return thresholdWarning;
    }

    public int getThresholdGood() {
        return thresholdGood;
    }
}
