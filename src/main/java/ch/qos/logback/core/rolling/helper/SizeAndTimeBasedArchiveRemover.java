package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SizeAndTimeBasedArchiveRemover extends TimeBasedArchiveRemover {
   protected static final int NO_INDEX = -1;

   public SizeAndTimeBasedArchiveRemover(FileNamePattern var1, RollingCalendar var2) {
      super(var1, var2);
   }

   private String createStemRegex(Instant var1) {
      return FileFilterUtil.afterLastSlash(super.fileNamePattern.toRegexForFixedDate(var1));
   }

   public File[] getFilesInPeriod(Instant var1) {
      return FileFilterUtil.filesInFolderMatchingStemRegex(((TimeBasedArchiveRemover) this).getParentDir(new File(super.fileNamePattern.convertMultipleArguments(new Object[]{var1, 0}))), this.createStemRegex(var1));
   }

   public void descendingSort(File[] var1, Instant var2) {
      Pattern var3 = Pattern.compile(this.createStemRegex(var2));
      Arrays.sort(var1, new Comparator<File>() {
         private int extractIndex(Pattern pattern, File file) {
            Matcher matcher = pattern.matcher(file.getName());
            if (!matcher.find()) {
               return -1;
            }
            String group = matcher.group(1);
            if (group == null || group.isEmpty()) {
               return -1;
            }
            return Integer.parseInt(group);
         }

         public int compare(File fileA, File fileB) {
            int indexA = extractIndex(var3, fileA);
            int indexB = extractIndex(var3, fileB);
            if (indexA == indexB) {
               return 0;
            }
            if (indexB < indexA) {
               return -1;
            }
            return 1;
         }
      });
   }
}