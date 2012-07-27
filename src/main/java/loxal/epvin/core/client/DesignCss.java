/*
 * Copyright 2012 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package loxal.epvin.core.client;

import com.google.gwt.resources.client.CssResource;

/**
 * @author Alexander Orlov <alexander.orlov@loxal.net>
 */
public interface DesignCss extends CssResource {
    String error();

    String success();

    String failure();

    String info();
}
