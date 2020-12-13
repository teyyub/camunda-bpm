package org.camunda.bpm.getstarted;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrintDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("processDefinition "
                +delegateExecution.getProcessDefinitionId()
                +", activity " + delegateExecution.getCurrentActivityId());
    }
}
