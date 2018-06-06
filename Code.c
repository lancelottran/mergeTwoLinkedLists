//
// Definition for singly-linked list:
// typedef struct list_##name {
//   type value;
//   struct list_##name *next;
// } list_##name;
//
// list_##name *alloc_list_##name(type v) {
//   list_##name *l = calloc(1, sizeof(list_##name));
//   l->value = v;
//   return l;
// }
//
list_integer * mergeTwoLinkedLists(list_integer * l1, list_integer * l2) {
    list_integer * res = NULL;
    
    if(l1 != NULL || l2 != NULL){
        if(l2 == NULL || l1 != NULL && l1->value <= l2->value){
            res = alloc_list_integer(l1->value);
            res->next = mergeTwoLinkedLists(l1->next, l2);
        }else{
            res = alloc_list_integer(l2->value);
            res->next = mergeTwoLinkedLists(l1, l2->next);
        }
    }

    
    return res;
}
