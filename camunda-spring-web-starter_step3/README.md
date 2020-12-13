camunda spring-web starter ucun

https://docs.camunda.org/get-started/spring/project-setup/

run etmek ucun

mvn clean package


sonra war file ni tomcatda webapps qovlugunu atiriq

h2 ye nece baxmaq olar helelik deqiq bilmirem


demeli bmpn filenin yuklenmsi ucun

@Bean
public SpringProcessEngineConfiguration engineConfiguration(
    DataSource dataSource,
    PlatformTransactionManager transactionManager,
    @Value("classpath*:*.bpmn") Resource[] deploymentResources) {
  SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();

  configuration.setProcessEngineName("engine");
  configuration.setDataSource(dataSource);
  configuration.setTransactionManager(transactionManager);
  configuration.setDatabaseSchemaUpdate("true");
  configuration.setJobExecutorActivate(false);
  configuration.setDeploymentResources(deploymentResources);

  return configuration;
}

bu sekilde olmasi vacibdir

hokmen processes.xml file olmalidir

 <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-engine</artifactId>
      <scope>provided</scope>
    </dependency>
<scope>provided</scope> olmalidir cunki production codunda bu setr yoxdur ve compile olunmur

contexte @Bean
             public SpringProcessApplication processApplication() { return new SpringProcessApplication(); }
             artirildmalidir
             
