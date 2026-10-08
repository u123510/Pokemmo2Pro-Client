package cn.pokemmo.net.packet.router;

import f.*;
import cn.pokemmo.net.session.SessionState;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/**
 * 客户端网络入站协议路由分发器 (Packet Route Dispatcher)
 * 
 * 职责:
 * 1. 从底层 TCP 数据流缓冲区中解包、按需进行 Zlib 动态解压缩 (Inflater)；
 * 2. 读取协议操作码 (Opcode: 0x01 - 0xFF)，根据当前网络会话生命周期状态 (SessionState) 进行分级路由；
 * 3. 构造对应的强类型服务端入站协议包 (InboundPacket) 实例并注入操作码与数据载荷；
 * 4. 捕获并记录协议异常或未知 Opcode 的十六进制日志跟踪。
 * 
 * 原混淆类: f.ho_1
 */

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class PacketRouteDispatcher {
   public static final dl_1 LOGGER = Cq0.E1(PacketRouteDispatcher.class);
    public static final dl_1 ss = LOGGER;
    public static final ByteBuffer INFLATION_INPUT_BUFFER;
    public static final ByteBuffer INFLATION_OUTPUT_BUFFER;
    public static final ByteBuffer I70;
    public static final ByteBuffer cW;

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static GH dispatch(ByteBuffer var0, k20_0 var1, boolean var2) {
        return parseInboundPacket(var0, var1, var2);
    }

    public static GH tS(ByteBuffer var0, k20_0 var1, boolean var2) {
        return parseInboundPacket(var0, var1, var2);
    }

    public static GH parseInboundPacket(ByteBuffer var0, k20_0 var1, boolean var2) {
      int var3 = var0.get() & 255;
      if (!var2 && var0.get() == 1) {
         ByteBuffer var10000 = I70;
         ByteBuffer var4;
         ByteBuffer var10001 = var4 = I70;
         ((Buffer)var4).clear();
         var10001.put(var0);
         var10000.putInt(-65536);
         Inflater var9;
         Inflater var15 = var9 = var1.Oo0;
         byte[] var11 = var4.array();
         int var5 = var4.position();
         var15.setInput(var11, 0, var5);

          ByteBuffer decompressed = cW;

          try {
             ((Buffer)decompressed).limit(var9.inflate(decompressed.array()));
          } catch (DataFormatException var7) {
             var7.printStackTrace();
             return null;
          }

          ((Buffer)decompressed).position(0);
          var0 = decompressed;
      }

      Object var10 = null;
      int var13;
      if (var2) {
         var13 = 5;
      } else {
         var13 = var1.Co0;
      }

      int var14;
      label313:
      if ((var14 = J90.Qj(var13)) == 0) {
         dk0(var13, var3, var0);
      } else if (var14 != 1) {
         if (var14 != 2) {
            if (var14 == 4) {
               switch (var3) {
                  case 1:
                     var10 = new ni0_0(var1, var0);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  case 47:
                  case 98:
                  case 106:
                  case 124:
                  case 125:
                  case 126:
                  case 127:
                  case 130:
                  case 138:
                  case 139:
                  case 140:
                  case 141:
                  case 142:
                  case 143:
                  case 159:
                  case 174:
                  case 175:
                  case 191:
                  case 202:
                  case 203:
                  case 204:
                  case 205:
                  case 206:
                  case 207:
                  case 221:
                  case 222:
                  case 223:
                  case 240:
                  case 254:
                  default:
                     break label313;
                  case 220:
                     var10 = new pro.pokemmo2.shop.protocol.OpenMmoShopControl(var1, var0);
                     break;
                  case 5:
                     var10 = new ga_0(var1, var0);
                     break;
                  case 6:
                     var10 = new P60(var1, var0);
                     break;
                  case 7:
                     var10 = new DE(var1, var0);
                     break;
                  case 8:
                     var10 = new mv0(var1, var0);
                     break;
                  case 9:
                     var10 = new ng_0(var1, var0);
                     break;
                  case 10:
                     var10 = new J50(var1, var0);
                     break;
                  case 11:
                     var10 = new PV(var1, var0);
                     break;
                  case 12:
                     var10 = new lpt9__3(var1, var0);
                     break;
                  case 13:
                     var10 = new wb0_0(var1, var0);
                     break;
                  case 14:
                     var10 = new jv_2(var1, var0);
                     break;
                  case 15:
                     var10 = new lpt8__1(var1, var0);
                     break;
                  case 16:
                     var10 = new Sb(var1, var0);
                     break;
                  case 17:
                     var10 = new wi_1(var1, var0);
                     break;
                  case 18:
                     var10 = new b0_0(var1, var0);
                     break;
                  case 19:
                     var10 = new Gd0(var1, var0);
                     break;
                  case 20:
                     var10 = new H60(var1, var0);
                     break;
                  case 21:
                     var10 = new R3(var1, var0);
                     break;
                  case 22:
                     var10 = new OM(var1, var0);
                     break;
                  case 23:
                     var10 = new oy0_0(var1, var0);
                     break;
                  case 24:
                     var10 = new ND(var1, var0);
                     break;
                  case 25:
                     var10 = new YS(var1, var0);
                     break;
                  case 26:
                     var10 = new Ix0(var1, var0);
                     break;
                  case 27:
                     var10 = new a4_0(var1, var0);
                     break;
                  case 28:
                     var10 = new nu0_0(var1, var0);
                     break;
                  case 29:
                     var10 = new EC0(var1, var0);
                     break;
                  case 30:
                     var10 = new I1(var1, var0);
                     break;
                  case 31:
                     var10 = new K7(var1, var0);
                     break;
                  case 32:
                     var10 = new ll_1(var1, var0);
                     break;
                  case 33:
                     var10 = new kt_0(var1, var0);
                     break;
                  case 34:
                     var10 = new nu_1(var1, var0);
                     break;
                  case 35:
                     var10 = new EL(var1, var0);
                     break;
                  case 36:
                     var10 = new QB0(var1, var0);
                     break;
                  case 37:
                     var10 = new RE0(var1, var0);
                     break;
                  case 38:
                     var10 = new t3_0(var1, var0);
                     break;
                  case 39:
                     var10 = new ff_1(var1, var0);
                     break;
                  case 40:
                     var10 = new Q30(var1, var0);
                     break;
                  case 41:
                     var10 = new yg_1(var1, var0);
                     break;
                  case 42:
                     var10 = new go_1(var1, var0);
                     break;
                  case 43:
                     var10 = new T0(var1, var0);
                     break;
                  case 44:
                     var10 = new fc_0(var1, var0);
                     break;
                  case 45:
                     var10 = new jj_0(var1, var0);
                     break;
                  case 46:
                     var10 = new mz0_0(var1, var0);
                     break;
                  case 48:
                     var10 = new iv_1(var1, var0);
                     break;
                  case 49:
                     var10 = new lm_2(var1, var0);
                     break;
                  case 50:
                     var10 = new N20(var1, var0);
                     break;
                  case 51:
                     var10 = new Fv0(var1, var0);
                     break;
                  case 52:
                     var10 = new BJ(var1, var0);
                     break;
                  case 53:
                     var10 = new sp_0(var1, var0);
                     break;
                  case 54:
                     var10 = new Wn0(var1, var0);
                     break;
                  case 55:
                     var10 = new sv_1(var1, var0);
                     break;
                  case 56:
                     var10 = new WB0(var1, var0);
                     break;
                  case 57:
                     var10 = new lh_2(var1, var0);
                     break;
                  case 58:
                     var10 = new SG(var1, var0);
                     break;
                  case 59:
                     var10 = new R6(var1, var0);
                     break;
                  case 60:
                     var10 = new e5_0(var1, var0);
                     break;
                  case 61:
                     var10 = new r10_0(var1, var0);
                     break;
                  case 62:
                     var10 = new wr_1(var1, var0);
                     break;
                  case 63:
                     var10 = new P3(var1, var0);
                     break;
                  case 64:
                     var10 = new su_1(var1, var0);
                     break;
                  case 65:
                     var10 = new TC(var1, var0);
                     break;
                  case 66:
                     var10 = new JJ(var1, var0);
                     break;
                  case 67:
                     var10 = new Kx0(var1, var0);
                     break;
                  case 68:
                     var10 = new PU(var1, var0);
                     break;
                  case 69:
                     var10 = new ey_1(var1, var0);
                     break;
                  case 70:
                     var10 = new e7_0(var1, var0);
                     break;
                  case 71:
                     var10 = new el_1(var1, var0);
                     break;
                  case 72:
                     var10 = new fl0_1(var1, var0);
                     break;
                  case 73:
                     var10 = new cg_2(var1, var0);
                     break;
                  case 74:
                     var10 = new sa_1(var1, var0);
                     break;
                  case 75:
                     var10 = new c00_0(var1, var0);
                     break;
                  case 76:
                     var10 = new wf0_0(var1, var0);
                     break;
                  case 77:
                     var10 = new al0_2(var1, var0);
                     break;
                  case 78:
                     var10 = new o8_0(var1, var0);
                     break;
                  case 79:
                     var10 = new ds0_0(var1, var0);
                     break;
                  case 80:
                     var10 = new bg_0(var1, var0);
                     break;
                  case 81:
                     var10 = new nm_0(var1, var0);
                     break;
                  case 82:
                     var10 = new Y7(var1, var0);
                     break;
                  case 83:
                     var10 = new k90_0(var1, var0);
                     break;
                  case 84:
                     var10 = new jv_0(var1, var0);
                     break;
                  case 85:
                     var10 = new tv0_0(var1, var0);
                     break;
                  case 86:
                     var10 = new bh0_0(var1, var0);
                     break;
                  case 87:
                     var10 = new ek0_1(var1, var0);
                     break;
                  case 88:
                     var10 = new nx_1(var1, var0);
                     break;
                  case 89:
                     var10 = new lw_1(var1, var0);
                     break;
                  case 90:
                     var10 = new OO(var1, var0);
                     break;
                  case 91:
                     var10 = new cd_2(var1, var0);
                     break;
                  case 92:
                     var10 = new Xc(var1, var0);
                     break;
                  case 93:
                     var10 = new IR(var1, var0);
                     break;
                  case 94:
                     var10 = new O5(var1, var0);
                     break;
                  case 95:
                     var10 = new I8(var1, var0);
                     break;
                  case 96:
                     var10 = new PE0(var1, var0);
                     break;
                  case 97:
                     var10 = new il_2(var1, var0);
                     break;
                  case 99:
                     var10 = new DH(var1, var0);
                     break;
                  case 100:
                     var10 = new j60_0(var1, var0);
                     break;
                  case 101:
                     var10 = new cs0_0(var1, var0);
                     break;
                  case 102:
                     var10 = new ki_1(var1, var0);
                     break;
                  case 103:
                     var10 = new r00_0(var1, var0);
                     break;
                  case 104:
                     var10 = new st_1(var1, var0);
                     break;
                  case 105:
                     var10 = new bm0_0(var1, var0);
                     break;
                  case 107:
                     var10 = new W10(var1, var0);
                     break;
                  case 108:
                     var10 = new df_2(var1, var0);
                     break;
                  case 109:
                     var10 = new Vr(var1, var0);
                     break;
                  case 110:
                     var10 = new ds_0(var1, var0);
                     break;
                  case 111:
                     var10 = new fr_0(var1, var0);
                     break;
                  case 112:
                     var10 = new N70(var1, var0);
                     break;
                  case 113:
                     var10 = new Ry0(var1, var0);
                     break;
                  case 114:
                     var10 = new sx_2(var1, var0);
                     break;
                  case 115:
                     var10 = new lpt6__3(var1, var0);
                     break;
                  case 116:
                     var10 = new Jr0(var1, var0);
                     break;
                  case 117:
                     var10 = new xf0_0(var1, var0);
                     break;
                  case 118:
                     var10 = new wb0_1(var1, var0);
                     break;
                  case 119:
                     var10 = new Kl(var1, var0);
                     break;
                  case 120:
                     var10 = new ej_2(var1, var0);
                     break;
                  case 121:
                     var10 = new sy0_0(var1, var0);
                     break;
                  case 122:
                     var10 = new wu_1(var1, var0);
                     break;
                  case 123:
                     var10 = new cc_0(var1, var0);
                     break;
                  case 128:
                     var10 = new HJ(var1, var0);
                     break;
                  case 129:
                     var10 = new NI0(var1, var0);
                     break;
                  case 131:
                     var10 = new bu_2(var1, var0);
                     break;
                  case 132:
                     var10 = new nul__2(var1, var0);
                     break;
                  case 133:
                     var10 = new YV(var1, var0);
                     break;
                  case 134:
                     var10 = new UL(var1, var0);
                     break;
                  case 135:
                     var10 = new GC(var1, var0);
                     break;
                  case 136:
                     var10 = new ka0_0(var1, var0);
                     break;
                  case 137:
                     var10 = new M80(var1, var0);
                     break;
                  case 144:
                     var10 = new wm0_0(var1, var0);
                     break;
                  case 145:
                     var10 = new Mq0(var1, var0);
                     break;
                  case 146:
                     var10 = new tp0_0(var1, var0);
                     break;
                  case 147:
                     var10 = new nb0_1(var1, var0);
                     break;
                  case 148:
                     var10 = new of0_0(var1, var0);
                     break;
                  case 149:
                     var10 = new Zo0(var1, var0);
                     break;
                  case 150:
                     var10 = new zq_0(var1, var0);
                     break;
                  case 151:
                     var10 = new oi0_1(var1, var0);
                     break;
                  case 152:
                     var10 = new B50(var1, var0);
                     break;
                  case 153:
                     var10 = new g_0(var1, var0);
                     break;
                  case 154:
                     var10 = new TH0(var1, var0);
                     break;
                  case 155:
                     var10 = new bl_1(var1, var0);
                     break;
                  case 156:
                     var10 = new ND0(var1, var0);
                     break;
                  case 157:
                     var10 = new UF0(var1, var0);
                     break;
                  case 158:
                     var10 = new Mm0(var1, var0);
                     break;
                  case 160:
                     var10 = new nd0_2(var1, var0);
                     break;
                  case 161:
                     var10 = new ao_0(var1, var0);
                     break;
                  case 162:
                     var10 = new j2_0(var1, var0);
                     break;
                  case 163:
                     var10 = new QG0(var1, var0);
                     break;
                  case 164:
                     var10 = new yx_0(var1, var0);
                     break;
                  case 165:
                     var10 = new fx_1(var1, var0);
                     break;
                  case 166:
                     var10 = new ns_1(var1, var0);
                     break;
                  case 167:
                     var10 = new gl_0(var1, var0);
                     break;
                  case 168:
                     var10 = new yb_2(var1, var0);
                     break;
                  case 169:
                     var10 = new Z7(var1, var0);
                     break;
                  case 170:
                     var10 = new PT(var1, var0);
                     break;
                  case 171:
                     var10 = new IV(var1, var0);
                     break;
                  case 172:
                     var10 = new ol_0(var1, var0);
                     break;
                  case 173:
                     var10 = new pn_0(var1, var0);
                     break;
                  case 176:
                     var10 = new Q00(var1, var0);
                     break;
                  case 177:
                     var10 = new w5(var1, var0);
                     break;
                  case 178:
                     var10 = new MI0(var1, var0);
                     break;
                  case 179:
                     var10 = new br0_0(var1, var0);
                     break;
                  case 180:
                     var10 = new hw_0(var1, var0);
                     break;
                  case 181:
                     var10 = new Rp0(var1, var0);
                     break;
                  case 182:
                     var10 = new k10_0(var1, var0);
                     break;
                  case 183:
                     var10 = new h5_0(var1, var0);
                     break;
                  case 184:
                     var10 = new yn_1(var1, var0);
                     break;
                  case 185:
                     var10 = new Q6(var1, var0);
                     break;
                  case 186:
                     var10 = new zl0_1(var1, var0);
                     break;
                  case 187:
                     var10 = new nl0_2(var1, var0);
                     break;
                  case 188:
                     var10 = new me_1(var1, var0);
                     break;
                  case 189:
                     var10 = new Lu0(var1, var0);
                     break;
                  case 190:
                     var10 = new U50(var1, var0);
                     break;
                  case 192:
                     var10 = new rl_1(var1, var0);
                     break;
                  case 193:
                     var10 = new S5(var1, var0);
                     break;
                  case 194:
                     var10 = new Da0(var1, var0);
                     break;
                  case 195:
                     var10 = new ra0_2(var1, var0);
                     break;
                  case 196:
                     var10 = new w00_0(var1, var0);
                     break;
                  case 197:
                     var10 = new oc0_1(var1, var0);
                     break;
                  case 198:
                     var10 = new LA(var1, var0);
                     break;
                  case 199:
                     var10 = new nul__0(var1, var0);
                     break;
                  case 200:
                     var10 = new mv_2(var1, var0);
                     break;
                  case 201:
                     var10 = new dv_2(var1, var0);
                     break;
                  case 208:
                     var10 = new k50_0(var1, var0);
                     break;
                  case 209:
                     var10 = new Wy0(var1, var0);
                     break;
                  case 210:
                     var10 = new RX(var1, var0);
                     break;
                  case 211:
                     var10 = new IC(var1, var0);
                     break;
                  case 212:
                     var10 = new y70_0(var1, var0);
                     break;
                  case 213:
                     var10 = new uv_0(var1, var0);
                     break;
                  case 214:
                     var10 = new MF(var1, var0);
                     break;
                  case 215:
                     var10 = new z_0(var1, var0);
                     break;
                  case 216:
                     var10 = new J80(var1, var0);
                     break;
                  case 217:
                     var10 = new c40(var1, var0);
                     break;
                  case 218:
                     var10 = new iq_0(var1, var0);
                     break;
                  case 219:
                     var10 = new gj0_0(var1, var0);
                     break;
                  case 224:
                  case 225:
                  case 226:
                  case 227:
                  case 228:
                  case 229:
                  case 230:
                  case 231:
                  case 232:
                  case 233:
                  case 234:
                  case 235:
                  case 236:
                  case 237:
                  case 238:
                  case 239:
                     var10 = new P60(var1, var0);
                     break;
                  case 241:
                     var10 = new l90_0(var1, var0);
                     break;
                  case 242:
                     var10 = new kj0_1(var1, var0);
                     break;
                  case 243:
                     var10 = new NW(var1, var0);
                     break;
                  case 244:
                     var10 = new C1(var1, var0);
                     break;
                  case 245:
                     var10 = new dg0_1(var1, var0);
                     break;
                  case 246:
                     var10 = new b8(var1, var0);
                     break;
                  case 247:
                     var10 = new p5_0(var1, var0);
                     break;
                  case 248:
                     var10 = new _synchronized(var1, var0);
                     break;
                  case 249:
                     var10 = new PI(var1, var0);
                     break;
                  case 250:
                     var10 = new xa0_2(var1, var0);
                     break;
                  case 251:
                     var10 = new z8_0(var1, var0);
                     break;
                  case 252:
                     var10 = new ZE0(var1, var0);
                     break;
                  case 253:
                     var10 = new O9(var1, var0);
                     break;
                  case 255:
                     var10 = new K8(var1, var0);
               }
            }
         } else {
            switch (var3) {
               case 2:
                  var10 = new I6(var1, var0);
                  break;
               case 3:
                  var10 = new k7_0(var1, var0);
                  break;
               case 4:
                  var10 = new bl0_1(var1, var0);
                  break;
               case 9:
                  var10 = new ng_0(var1, var0);
                  break;
               case 10:
                  var10 = new J50(var1, var0);
                  break;
               case 16:
                  var10 = new Sb(var1, var0);
                  break;
               case 19:
                  var10 = new Gd0(var1, var0);
                  break;
               case 28:
                  var10 = new nu0_0(var1, var0);
                  break;
               case 29:
                  var10 = new EC0(var1, var0);
                  break;
               case 32:
                  var10 = new ll_1(var1, var0);
                  break;
               case 41:
                  var10 = new yg_1(var1, var0);
                  break;
               case 43:
                  var10 = new T0(var1, var0);
                  break;
               case 47:
                  var10 = new yr_0(var1, var0);
                  break;
               case 64:
                  var10 = new su_1(var1, var0);
                  break;
               case 74:
                  var10 = new sa_1(var1, var0);
                  break;
               case 75:
                  var10 = new c00_0(var1, var0);
                  break;
               case 85:
                  var10 = new tv0_0(var1, var0);
                  break;
               case 97:
                  var10 = new il_2(var1, var0);
                  break;
               case 98:
                  var10 = new SN(var1, var0);
                  break;
               case 99:
                  var10 = new DH(var1, var0);
                  break;
               case 103:
                  var10 = new r00_0(var1, var0);
                  break;
               case 114:
                  var10 = new sx_2(var1, var0);
                  break;
               case 116:
                  var10 = new Jr0(var1, var0);
                  break;
               case 135:
                  var10 = new GC(var1, var0);
                  break;
               case 144:
                  var10 = new wm0_0(var1, var0);
                  break;
               case 145:
                  var10 = new Mq0(var1, var0);
                  break;
               case 146:
                  var10 = new tp0_0(var1, var0);
                  break;
               case 152:
                  var10 = new B50(var1, var0);
                  break;
               case 185:
                  var10 = new Q6(var1, var0);
                  break;
               case 186:
                  var10 = new zl0_1(var1, var0);
                  break;
               case 240:
                  var10 = new oc_1(var1, var0);
                  break;
               case 241:
                  var10 = new l90_0(var1, var0);
                  break;
               case 243:
                  var10 = new NW(var1, var0);
                  break;
               case 255:
                  var10 = new K8(var1, var0);
                  break;
               default:
                  break label313;
            }
         }
      } else {
         switch (var3) {
            case 1:
               var10 = new ni0_0(var1, var0);
               break;
            case 4:
               var10 = new bl0_1(var1, var0);
               break;
            case 15:
               var10 = new lpt8__1(var1, var0);
               break;
            case 16:
               var10 = new Sb(var1, var0);
               break;
            case 19:
               var10 = new Gd0(var1, var0);
               break;
            case 32:
               var10 = new ll_1(var1, var0);
               break;
            case 64:
               var10 = new su_1(var1, var0);
               break;
            case 97:
               var10 = new il_2(var1, var0);
               break;
            case 135:
               var10 = new GC(var1, var0);
               break;
            case 185:
               var10 = new Q6(var1, var0);
               break;
            case 255:
               var10 = new K8(var1, var0);
               break;
            default:
               break label313;
         }
      }

      if (var10 != null) {
         ((JM)var10).L8 = var3;
      }

      return (GH)var10;
   }

   public static void logUnexpectedOpcode(int var0, int var1, ByteBuffer var2) {
        Object[] var3 = new Object[3];
        var3[0] = String.format("0x%02X", var1);
        var3[1] = SessionState.getStateName(var0);
        var3[2] = tx_1.dE(var2);
        LOGGER.warn("{}, {} \n{}", var3);
    }

    public static void dk0(int var0, int var1, ByteBuffer var2) {
        logUnexpectedOpcode(var0, var1, var2);
    }

    private static void _legacy_dk0(int var0, int var1, ByteBuffer var2) {
      dl_1 var10000 = ss;
      Object[] var3;
      Object[] var10001 = var3 = new Object[3];
      Object[] var4;
      (var4 = new Object[1])[0] = var1;
      var3[0] = String.format("0x%02X", var4);
      var3[1] = az_2.Id(var0);
      var10001[2] = tx_1.dE(var2);
      var10000.warn("{}, {} \n{}", var3);
   }

   static {
      ByteBuffer var10000 = ByteBuffer.allocate(30000);
      ByteOrder var0 = ByteOrder.LITTLE_ENDIAN;
      INFLATION_INPUT_BUFFER = var10000.order(ByteOrder.LITTLE_ENDIAN);
      I70 = INFLATION_INPUT_BUFFER;
      INFLATION_OUTPUT_BUFFER = ByteBuffer.allocate(30000).order(var0);
      cW = INFLATION_OUTPUT_BUFFER;
   }
}

