package com.solt;

import com.solt.ds.Pair;
import com.solt.evaluator.AddEvaluator;
import com.solt.render.FormalRender;
import com.solt.render.VerboseRender;
import com.solt.service.EvaluatorService;

import java.security.Provider;

public class Main {

    public static void main(String[] args) {
        EvaluatorService evaluatorService = new EvaluatorService();
        evaluatorService.takeAction(
                new AddEvaluator(),
                new VerboseRender(),
                new Pair(5,7)
        );
    }
}
