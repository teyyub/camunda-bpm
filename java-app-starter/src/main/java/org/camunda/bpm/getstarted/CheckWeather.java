package org.camunda.bpm.getstarted;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class CheckWeather implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random r = new Random();
        delegateExecution.setVariable("name","teyyub");
        delegateExecution.setVariable("weatherOk",r.nextBoolean());
    }
}
