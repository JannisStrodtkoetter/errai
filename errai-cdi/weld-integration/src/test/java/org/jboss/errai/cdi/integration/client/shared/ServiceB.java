/*
 * Copyright 2011 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.cdi.integration.client.shared;

import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.InitBallot;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Mike Brock
 */
@ApplicationScoped
public class ServiceB {
  @Inject ServiceC serviceC;

  @Inject InitBallot<ServiceB> ballot;

  @PostConstruct
  public void doVote() {
    ballot.voteForInit();
  }

  @AfterInitialization
  public void afterInit() {
    System.out.println("AFTER INIT!");
  }

  public ServiceC getServiceC() {
    return serviceC;
  }
}