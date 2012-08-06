/*
 * Copyright 2012 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package loxal.epvin.core.client;

import com.google.gwt.user.client.Window;

/**
 * @author Alexander Orlov <alexander.orlov@loxal.net>
 */
public class ClientFactoryPhoneImpl extends ClientFactoryImpl {
  ClientFactoryPhoneImpl() {
    super();
    ClientResource.INSTANCE.main().ensureInjected();
    Window.setTitle("PHONE Employee Import | " + super.getClientResource().companyDesignator);
  }
}
