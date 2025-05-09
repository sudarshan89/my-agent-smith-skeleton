package com.upstream.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ActivityImplementations {
    // initialised in the WorkerApp
    static LLMManager.LLMClient llmClient;
    // @TODO missing implementation across all the activity implementations
    public static class FetchContentActivityImpl implements Activities.FetchContentActivity {
        @Override
        public String fetch(String url) {
            System.out.println("Invoked FetchContentActivity");
            return "";
        }
    }

    public static class SummariseContentDiffActivityImpl implements Activities.SummariseContentDiffActivity {

        @Override
        public String summariseContentDiff(String prevContent, String currentContent) {
            System.out.println("Invoked SummariseContentDiffActivity");
            return "";
        }
    }

    public static class SelectPromotionChannelActivityImpl implements Activities.SelectPromotionChannelActivity {

        @Override
        public String select(String summary) {
            System.out.println("Invoked SelectPromotionChannelActivity");
            return "";
        }
    }

    public static class PromoteContentActivityImpl implements Activities.PromoteContentActivity {
        @Override
        public void promote(String summary, String channel) {
            System.out.printf("🚀 Promoting to %s. \n The post will include -- %s\n", channel, summary);
            // Optionally: Add real Slack/GitHub posting logic here.
        }
    }
}