package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class ay extends a {
    public afh mbx;
    public LinkedList<afi> mby = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mbx == null) {
                throw new b("Not all required fields were included: LogHead");
            }
            if (this.mbx != null) {
                aVar.dX(1, this.mbx.aHr());
                this.mbx.a(aVar);
            }
            aVar.d(2, 8, this.mby);
            return 0;
        } else if (i == 1) {
            if (this.mbx != null) {
                r0 = a.a.a.a.dU(1, this.mbx.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.c(2, 8, this.mby);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mby.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mbx != null) {
                return 0;
            }
            throw new b("Not all required fields were included: LogHead");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ay ayVar = (ay) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        afh com_tencent_mm_protocal_c_afh = new afh();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_afh.a(aVar4, com_tencent_mm_protocal_c_afh, a.a(aVar4))) {
                        }
                        ayVar.mbx = com_tencent_mm_protocal_c_afh;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        afi com_tencent_mm_protocal_c_afi = new afi();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_afi.a(aVar4, com_tencent_mm_protocal_c_afi, a.a(aVar4))) {
                        }
                        ayVar.mby.add(com_tencent_mm_protocal_c_afi);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}