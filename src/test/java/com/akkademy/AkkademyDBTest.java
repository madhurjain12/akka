package com.akkademy;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import com.akkademy.messages.SetRequest;
import akka.actor.ActorRef;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class AkkademyDBTest {

    ActorSystem system =  ActorSystem.create();

    @Test
    public void itShouldPlaceKeyValueFromSetMessageIntoMap() {
        TestActorRef<AkkademyDB> actorRef = TestActorRef.create(system, Props.create(AkkademyDB.class));
        actorRef.tell(new SetRequest("key","value"),ActorRef.noSender());
        AkkademyDB akkademyDB = actorRef.underlyingActor();
        assertEquals(akkademyDB.map.get("key"),"value");


    }
}
