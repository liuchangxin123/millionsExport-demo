package com.pluto.millionsExport.repository;

import com.pluto.millionsExport.jooqData.tables.pojos.MillionsData;
import com.pluto.millionsExport.jooqData.tables.records.MillionsDataRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.pluto.millionsExport.jooqData.Tables.MILLIONS_DATA;

/**
 * @author pluto
 * @date 2023/5/10
 */
@Repository
public class MillionsDataRepository extends AbstractParasolSingleRepository<MillionsData> {


    public void batchInsert(List<MillionsDataRecord> millionsDataList) {
        dslContext.batchInsert(millionsDataList).execute();
    }

    public Long count(){
        return dslContext.selectCount().from(MILLIONS_DATA).fetchOne(0, Long.class);
    }

    public List<MillionsData> select(int page, int size) {
        return dslContext.selectFrom(MILLIONS_DATA)
                .limit(page, size)
                .fetchInto(MillionsData.class);
    }
}
