package com.hst.hsweb.infrastructure.seedstack;

import org.seedstack.seed.core.internal.configuration.tool.ConfigTool;
import org.seedstack.seed.core.internal.configuration.tool.EffectiveConfigTool;
import org.seedstack.seed.spi.SeedTool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConfigToolLauncher {
    public static void main(String[] args) {
        SeedTool tool = new ConfigTool();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(tool);
        executorService.shutdown();
    }
}
