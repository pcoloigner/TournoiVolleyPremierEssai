package org.pcomeziantou.tournoivolley.tournoivolleyapp.infra.configuration;

import com.patternity.annotation.ddd.stereotype.DomainService;
import com.patternity.annotation.ddd.stereotype.Stub;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(
        basePackageClasses = {Match.class},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {DomainService.class, Stub.class})}
        //,
        //excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {StarShipInventoryStub.class})}
        )
public class DomainConfiguration {
}
