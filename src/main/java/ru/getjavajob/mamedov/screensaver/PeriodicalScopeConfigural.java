package ru.getjavajob.mamedov.screensaver;

import javafx.util.Pair;
import org.springframework.beans.factory.ObjectFactory;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.HashMap;
import java.util.Map;

import static java.time.OffsetTime.now;

/**
 * Created by Ganzhenko on 26.09.2016.
 */
public class PeriodicalScopeConfigural implements org.springframework.beans.factory.config.Scope {
    Map<String, Pair<OffsetTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (map.containsKey(name)) {
            Pair<OffsetTime, Object> pair = map.get(name);
            int second = now().getSecond();
            int second1 = pair.getKey().getSecond();
            int secondSinceLastRequest = second - second1;
            if(secondSinceLastRequest > 3) {
                map.put(name, new Pair(now(), objectFactory.getObject()));
            }
        } else {
            map.put(name, new Pair(now(), objectFactory.getObject()));
        }
        return map.get(name).getValue();
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
