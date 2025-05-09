package com.upstream.app;


import io.temporal.activity.ActivityOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class ContentAmplifierWorkflowImpl implements ContentAmplifierWorkflow {

    private final ActivityOptions options = ActivityOptions.newBuilder()
            .setStartToCloseTimeout(Duration.ofSeconds(10))
            .build();

    private final Activities.FetchContentActivity fetcher = Workflow.newActivityStub(Activities.FetchContentActivity.class, options);
    private final Activities.SummariseContentDiffActivity diffSummariser = Workflow.newActivityStub(Activities.SummariseContentDiffActivity.class, options);
    private final Activities.SelectPromotionChannelActivity channelSelector = Workflow.newActivityStub(Activities.SelectPromotionChannelActivity.class, options);

    private final Activities.PromoteContentActivity promoteContentActivity = Workflow.newActivityStub(Activities.PromoteContentActivity.class, options);


    //@TODO: Update the URL
    private static final String MONITORED_URL = "https://example.com/blog";
    private String lastContentHash = "";
    private String lastContent = "";

    @Override
    public void run() {
        System.out.println("Hello Workflow " + Workflow.getInfo().getWorkflowId() + " Run Id " + Workflow.getInfo().getRunId());

        String content = "";
        String hash = Integer.toString(content.hashCode());

        if (!hash.equals(lastContentHash)) {
            /**
             * Call the activities here
             */
            lastContentHash = hash;
            lastContent = content;
        }
    }
}
