package org.jboss.errai.marshalling.rebind;

import org.jboss.errai.marshalling.rebind.api.MappingContext;
import org.jboss.errai.marshalling.rebind.api.MappingStrategy;
import org.jboss.errai.marshalling.rebind.api.impl.DefaultJavaMappingStrategy;

/**
 * @author Mike Brock <cbrock@redhat.com>
 */
public class MappingStrategyFactory {

  static MappingStrategy createStrategy(final MappingContext context, final Class<?> clazz) {
    return new DefaultJavaMappingStrategy(context, clazz);
  }
}
