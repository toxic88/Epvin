/*
 * Copyright 2012 Alexander Orlov <alexander.orlov@loxal.net>. All rights reserved.
 */

package loxal.common.auth

import com.google.gwt.user.client.rpc.IsSerializable

public class AuthInfo : IsSerializable {
    var loggedIn: Boolean = false
    var admin: Boolean = false
    var loginUrl: String = ""
    var logoutUrl: String = ""
    var email: String = ""
    var nickname: String = ""
}