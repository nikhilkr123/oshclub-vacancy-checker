package io.nsoft;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AwsLambdaHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Starting Vacancy Seeker Job");
        String resp = new VacancySeekerService().seekVacancies();
        context.getLogger().log("Completed Vacancy Seeker Job");
        return "Success - " + resp;
    }
}
