/*
 * Copyright 2012 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package loxal.epvin.core.shared;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import loxal.epvin.datastore.model.OfyLocator;
import loxal.epvin.datastore.model.Resource;


@ProxyFor(value = Resource.class, locator = OfyLocator.class)
public interface ResourceProxy extends EntityProxy {

    String getName();

	void setName(String name);

}
