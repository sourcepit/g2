
package org.sourcepit.emfx.codegen.ecore.genmodel2.util;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;

public class GeneratorUtil
{
   public static Generator createGenerator(Object input)
   {
      Generator generator = new Generator();
      generator.setInput(input);
      JControlModel jControlModel = generator.getJControlModel();

      Map<?, ?> options = JavaCore.getOptions();
      String tabSize = (String) options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
      String braceStyle = (String) options
         .get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
      String tabCharacter = (String) options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
      if (JavaCore.TAB.equals(tabCharacter))
      {
         jControlModel.setLeadingTabReplacement("\t");
      }
      else
      {
         String spaces = "";
         for (int i = Integer.parseInt(tabSize); i > 0; --i)
         {
            spaces += " ";
         }
         jControlModel.setLeadingTabReplacement(spaces);
      }
      jControlModel.setConvertToStandardBraceStyle(DefaultCodeFormatterConstants.END_OF_LINE.equals(braceStyle));

      return generator;
   }
}
