package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class bao extends aqp {
    public int mbK;
    public abt mgm;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mgm == null) {
                throw new b("Not all required fields were included: HardDevice");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mgm != null) {
                aVar.dX(2, this.mgm.aHr());
                this.mgm.a(aVar);
            }
            aVar.dV(4, this.mbK);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mgm != null) {
                r0 += a.a.a.a.dU(2, this.mgm.aHr());
            }
            return r0 + a.a.a.a.dS(4, this.mbK);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mgm != null) {
                return 0;
            }
            throw new b("Not all required fields were included: HardDevice");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bao com_tencent_mm_protocal_c_bao = (bao) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bao.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        abt com_tencent_mm_protocal_c_abt = new abt();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_abt.a(aVar4, com_tencent_mm_protocal_c_abt, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bao.mgm = com_tencent_mm_protocal_c_abt;
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bao.mbK = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}