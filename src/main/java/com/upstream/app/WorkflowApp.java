package com.upstream.app;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.client.WorkflowOptions;
import io.temporal.serviceclient.WorkflowServiceStubsOptions;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

import java.util.UUID;


public class WorkflowApp {
    public static void main(String[] args) {
        System.out.println("Workflow started and the app is terminating. Long live the workflow ...");
    }
}
