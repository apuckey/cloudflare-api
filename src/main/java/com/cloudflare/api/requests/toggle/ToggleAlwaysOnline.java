package com.cloudflare.api.requests.toggle;

import com.cloudflare.api.CloudflareAccess;
import com.cloudflare.api.constants.CloudflareValue;
import com.cloudflare.api.constants.EnableOption;
import com.cloudflare.api.requests.CloudflareRequest;
import com.cloudflare.api.results.CloudflareError;

/**
 *
 * @author LoadLow
 */
public class ToggleAlwaysOnline extends CloudflareRequest {

    public ToggleAlwaysOnline(CloudflareAccess api, String domain, EnableOption option) {
        super(api, CloudflareValue.AlwaysOnlineStatus);
        add("z", domain);
        add("v", option.opt);
    }

    public boolean execute() throws CloudflareError {
        return this.executeBasic() != null;
    }
}
