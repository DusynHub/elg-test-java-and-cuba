package com.company.elgtest.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DdlGeneration;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "request")
@Entity(name = "elgtest_Request")
public class Request extends BaseIdentityIdEntity {
    private static final long serialVersionUID = -681109589314993084L;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private com.company.elgtest.entity.Customer customer;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "supplier_id")
    private com.company.elgtest.entity.Supplier supplier;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "request")
    private List<RequestItem> requestItems;

    public com.company.elgtest.entity.Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(com.company.elgtest.entity.Supplier supplier) {
        this.supplier = supplier;
    }

    public com.company.elgtest.entity.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.company.elgtest.entity.Customer customer) {
        this.customer = customer;
    }

    public List<RequestItem> getRequestItems() {
        return requestItems;
    }

    public void setRequestItems(List<RequestItem> requestItems) {
        this.requestItems = requestItems;
    }
}