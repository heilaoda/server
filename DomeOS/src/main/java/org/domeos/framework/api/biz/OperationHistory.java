package org.domeos.framework.api.biz;

import org.domeos.framework.api.model.operation.OperationRecord;

/**
 * Created by feiliu206363 on 2016/4/5.
 */
public interface OperationHistory {

    void insertRecord(OperationRecord record);

    void updateStatus(int id, String status);

    OperationRecord getById(int id);
}
