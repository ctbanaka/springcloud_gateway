package com.oneview.gateway.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {GatewayConfig.class})
@ExtendWith(SpringExtension.class)
class GatewayConfigTest {
    @Autowired
    private GatewayConfig gatewayConfig;

    @Test
    void testCorsWebFilter() {
        // TODO: This test is incomplete.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by corsWebFilter()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        this.gatewayConfig.corsWebFilter();
    }
}

