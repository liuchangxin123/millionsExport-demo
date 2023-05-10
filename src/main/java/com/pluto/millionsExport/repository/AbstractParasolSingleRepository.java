package com.pluto.millionsExport.repository;

import lombok.Getter;
import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author pluto
 * @date 2023/5/10
 */
public abstract class AbstractParasolSingleRepository<E extends Serializable> {

    @Resource
    DSLContext dslContext;

}
