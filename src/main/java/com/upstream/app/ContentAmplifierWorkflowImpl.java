package com.upstream.app;


import io.temporal.activity.ActivityOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class ContentAmplifierWorkflowImpl implements ContentAmplifierWorkflow {

    private final ActivityOptions options = ActivityOptions.newBuilder()
            .setStartToCloseTimeout(Duration.ofSeconds(10))
            .build();

    private final Activities.FetchContentActivity fetcher = Workflow.newActivityStub(Activities.FetchContentActivity.class, options);

    private String lastContentHash = "";
    private String lastContent = "";

    @Override
    public void run() {
        System.out.println("Hello Workflow " + Workflow.getInfo().getWorkflowId() + " Run Id " + Workflow.getInfo().getRunId());
        // @TODO missing implementation
        String content = "";
        String hash = Integer.toString(content.hashCode());

        if (!hash.equals(lastContentHash)) {
            // @TODO missing implementation
            lastContentHash = hash;
            lastContent = content;
        }
    }
}
