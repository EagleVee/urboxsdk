
#import "RNUrBoxSdk.h"

@implementation RNUrBoxSdk

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(showMessage) {
    UIAlertView *alert = [[UIAlertView alloc] initWithTitle:@"UIAlertView"
                                                    message:@"NATIVE CODE IS WORKING!" delegate:self cancelButtonTitle:@"Cancel"
                                          otherButtonTitles:@"OK", nil];
    [alert show];
}

@end
  
